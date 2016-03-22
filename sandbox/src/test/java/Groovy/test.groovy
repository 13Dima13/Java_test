import groovy.xml.XmlUtil
log.info('SETUP SCRIPT IS STARTED')

def get_config_data(file_path, sectionParam, key, value) {
    def root = new XmlSlurper().parse(new File(file_path))
    log.info root
    def section = root."${sectionParam}"
    log.info section
    def str = (section.add.find { it.@key == key }.@"$value").toString().split(';')
    def connectionStr = [:]
    str.each() {s ->
        def pair = s.split('=');
        connectionStr.put(pair[0], pair[1])
    }
    return connectionStr
}

def host = testRunner.testCase.testSuite.project.getPropertyValue("hostName")
def app = testRunner.testCase.testSuite.project.getPropertyValue("applicationName")
def company = testRunner.testCase.testSuite.project.getPropertyValue("company")
def eca_file_path = "\\\\$host\\c\$\\inetpub\\wwwroot\\$app\\Web.config"
log.info eca_file_path

log.info("Parsing connection string to DB")
def connectionString = get_config_data(eca_file_path, 'connectionStrings', 'connectionString', 'value')
def db_server = connectionString['Data Source']
def db_name = connectionString.containsKey('Database') ? connectionString['Database'] : connectionString['Initial Catalog']

testRunner.testCase.testSuite.project.setPropertyValue("db_server", db_server)
testRunner.testCase.testSuite.project.setPropertyValue("db_name", db_name)

log.info('SETUP SCRIPT IS ENDED')