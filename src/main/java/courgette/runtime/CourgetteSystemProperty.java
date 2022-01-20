package courgette.runtime;

final class CourgetteSystemProperty {
    final static String THREADS = "courgette.threads";
    final static String RUN_LEVEL = "courgette.runLevel";
    final static String RERUN_FAILED_SCENARIOS = "courgette.rerunFailedScenarios";
    final static String RERUN_ATTEMPTS = "courgette.rerunAttempts";
    final static String SHOW_TEST_OUTPUT = "courgette.showTestOutput";
    final static String PERSIST_PARALLEL_CUCUMBER_JSON_REPORTS = "courgette.persistParallelCucumberJsonReports";
    final static String VM_OPTIONS = "courgette.vmoptions";
    final static String REPORT_TITLE = "courgette.reportTitle";
    final static String REPORT_TARGET_DIR = "courgette.reportTargetDir";
    final static String ENVIRONMENT_INFO = "courgette.environmentInfo";
    final static String SLACK_WEBHOOK_URL = "courgette.slackWebhookUrl";
    final static String DEVICE_NAME_SYSTEM_PROPERTY = "courgette.mobile.device.name";
    final static String UDID_SYSTEM_PROPERTY = "courgette.mobile.device.udid";
    final static String PARALLEL_PORT_SYSTEM_PROPERTY = "courgette.mobile.device.parallel.port";
}