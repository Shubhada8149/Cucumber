$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/eclipse-workspace/Cucumber/src/main/java/features/deal_detail_map.feature");
formatter.feature({
  "line": 1,
  "name": "Deal Data Creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Create a new deal",
  "description": "",
  "id": "deal-data-creation;create-a-new-deal",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on Free CRM Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "otari.shubhada@gmail.com",
        "Test@123"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on sign in button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user click on deal menu",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user click on New button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user enters title,description,amount",
  "rows": [
    {
      "cells": [
        "title",
        "description",
        "amount"
      ],
      "line": 16
    },
    {
      "cells": [
        "test deal",
        "test description",
        "5000"
      ],
      "line": 17
    },
    {
      "cells": [
        "test deal 1",
        "test description 1",
        "6000"
      ],
      "line": 18
    },
    {
      "cells": [
        "test deal 2",
        "test description 2",
        "7000"
      ],
      "line": 19
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user click on save button",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "DealCreationWithMapDefinition.user_is_on_Free_CRM_Login_Page()"
});
formatter.result({
  "duration": 13831027880,
  "status": "passed"
});
formatter.match({
  "location": "DealCreationWithMapDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 4510428389,
  "status": "passed"
});
formatter.match({
  "location": "DealCreationWithMapDefinition.user_clicks_on_sign_in_button()"
});
formatter.result({
  "duration": 5132536890,
  "status": "passed"
});
formatter.match({
  "location": "DealCreationWithMapDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 760865978,
  "status": "passed"
});
formatter.match({
  "location": "DealCreationWithMapDefinition.user_click_on_deal_menu()"
});
formatter.result({
  "duration": 2253555337,
  "status": "passed"
});
formatter.match({
  "location": "DealCreationWithMapDefinition.user_click_on_New_button()"
});
formatter.result({
  "duration": 2387446249,
  "status": "passed"
});
formatter.match({
  "location": "DealCreationWithMapDefinition.user_enters_title_description_amount(DataTable)"
});
formatter.result({
  "duration": 28562785976,
  "status": "passed"
});
formatter.match({
  "location": "DealCreationWithMapDefinition.user_click_on_save_button()"
});
formatter.result({
  "duration": 38554,
  "status": "passed"
});
formatter.match({
  "location": "DealCreationWithMapDefinition.user_close_the_browser()"
});
formatter.result({
  "duration": 234735248,
  "status": "passed"
});
});