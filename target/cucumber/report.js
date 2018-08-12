$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ContactUs.feature");
formatter.feature({
  "line": 2,
  "name": "Validate contactUs page of WebDriverUniversity website with valid inputs",
  "description": "",
  "id": "validate-contactus-page-of-webdriveruniversity-website-with-valid-inputs",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ContactUs"
    }
  ]
});
formatter.scenarioOutline({
  "line": 10,
  "name": "provide the required input parameter for contactUs page in order to successfull submit action",
  "description": "",
  "id": "validate-contactus-page-of-webdriveruniversity-website-with-valid-inputs;provide-the-required-input-parameter-for-contactus-page-in-order-to-successfull-submit-action",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@ValidateSubmit"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User detail \u003cFirstName\u003e,\u003cLastName\u003e,\u003cEmail\u003e and \u003cComments\u003e are provided",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Validate the confirmation message from app \u003cMessage\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "validate-contactus-page-of-webdriveruniversity-website-with-valid-inputs;provide-the-required-input-parameter-for-contactus-page-in-order-to-successfull-submit-action;",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Email",
        "Comments",
        "Message",
        "url"
      ],
      "line": 16,
      "id": "validate-contactus-page-of-webdriveruniversity-website-with-valid-inputs;provide-the-required-input-parameter-for-contactus-page-in-order-to-successfull-submit-action;;1"
    },
    {
      "cells": [
        "\"Sarvesh\"",
        "\"Sinha\"",
        "\"sas@gmail.com\"",
        "\"here is the sample text\"",
        "\"Thank You for your Message!\"",
        "\"http://www.webdriveruniversity.com\""
      ],
      "line": 17,
      "id": "validate-contactus-page-of-webdriveruniversity-website-with-valid-inputs;provide-the-required-input-parameter-for-contactus-page-in-order-to-successfull-submit-action;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4111040427,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "enter the given application url",
  "rows": [
    {
      "cells": [
        "http://www.webdriveruniversity.com"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "click on contact us link",
  "keyword": "And "
});
formatter.match({
  "location": "ContactUsSteps.enter_the_application_url(DataTable)"
});
formatter.result({
  "duration": 3989607253,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.click_on_contact_us_link()"
});
formatter.result({
  "duration": 2005776213,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "provide the required input parameter for contactUs page in order to successfull submit action",
  "description": "",
  "id": "validate-contactus-page-of-webdriveruniversity-website-with-valid-inputs;provide-the-required-input-parameter-for-contactus-page-in-order-to-successfull-submit-action;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@ContactUs"
    },
    {
      "line": 9,
      "name": "@ValidateSubmit"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User detail \"Sarvesh\",\"Sinha\",\"sas@gmail.com\" and \"here is the sample text\" are provided",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Validate the confirmation message from app \"Thank You for your Message!\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Sarvesh",
      "offset": 13
    },
    {
      "val": "Sinha",
      "offset": 23
    },
    {
      "val": "sas@gmail.com",
      "offset": 31
    },
    {
      "val": "here is the sample text",
      "offset": 51
    }
  ],
  "location": "ContactUsSteps.enterInputFieldsValue(String,String,String,String)"
});
formatter.result({
  "duration": 1560097707,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.clickSubmitBtn()"
});
formatter.result({
  "duration": 1330307413,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thank You for your Message!",
      "offset": 44
    }
  ],
  "location": "ContactUsSteps.validateMessage(String)"
});
formatter.result({
  "duration": 200534,
  "status": "passed"
});
formatter.after({
  "duration": 722602240,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 20,
  "name": "provide the required input parameter for contactUs page in order to to verify reset functionality",
  "description": "",
  "id": "validate-contactus-page-of-webdriveruniversity-website-with-valid-inputs;provide-the-required-input-parameter-for-contactus-page-in-order-to-to-verify-reset-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@ValidateReset"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User detail \u003cFirstName\u003e,\u003cLastName\u003e,\u003cEmail\u003e and \u003cComments\u003e are provided",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User click on reset button",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Validate the confirmation message from app \u003cMessage\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "validate-contactus-page-of-webdriveruniversity-website-with-valid-inputs;provide-the-required-input-parameter-for-contactus-page-in-order-to-to-verify-reset-functionality;",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Email",
        "Comments",
        "Message",
        "url"
      ],
      "line": 26,
      "id": "validate-contactus-page-of-webdriveruniversity-website-with-valid-inputs;provide-the-required-input-parameter-for-contactus-page-in-order-to-to-verify-reset-functionality;;1"
    },
    {
      "cells": [
        "\"Sarvesh\"",
        "\"Sinha\"",
        "\"sas@gmail.com\"",
        "\"here is the sample text\"",
        "\"Thank You for your Message!\"",
        "\"http://www.webdriveruniversity.com\""
      ],
      "line": 27,
      "id": "validate-contactus-page-of-webdriveruniversity-website-with-valid-inputs;provide-the-required-input-parameter-for-contactus-page-in-order-to-to-verify-reset-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3318297173,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "enter the given application url",
  "rows": [
    {
      "cells": [
        "http://www.webdriveruniversity.com"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "click on contact us link",
  "keyword": "And "
});
formatter.match({
  "location": "ContactUsSteps.enter_the_application_url(DataTable)"
});
formatter.result({
  "duration": 4156558933,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.click_on_contact_us_link()"
});
formatter.result({
  "duration": 1932428800,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "provide the required input parameter for contactUs page in order to to verify reset functionality",
  "description": "",
  "id": "validate-contactus-page-of-webdriveruniversity-website-with-valid-inputs;provide-the-required-input-parameter-for-contactus-page-in-order-to-to-verify-reset-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@ContactUs"
    },
    {
      "line": 19,
      "name": "@ValidateReset"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User detail \"Sarvesh\",\"Sinha\",\"sas@gmail.com\" and \"here is the sample text\" are provided",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User click on reset button",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Validate the confirmation message from app \"Thank You for your Message!\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Sarvesh",
      "offset": 13
    },
    {
      "val": "Sinha",
      "offset": 23
    },
    {
      "val": "sas@gmail.com",
      "offset": 31
    },
    {
      "val": "here is the sample text",
      "offset": 51
    }
  ],
  "location": "ContactUsSteps.enterInputFieldsValue(String,String,String,String)"
});
formatter.result({
  "duration": 1543410347,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.clickResetBtn()"
});
formatter.result({
  "duration": 115063467,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thank You for your Message!",
      "offset": 44
    }
  ],
  "location": "ContactUsSteps.validateMessage(String)"
});
formatter.result({
  "duration": 83200,
  "status": "passed"
});
formatter.after({
  "duration": 706586880,
  "status": "passed"
});
});