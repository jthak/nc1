@addbasket
  Feature:Add to basket
    Scenario:User should be able to add to basket two nos. of items successfully
      Given user is on the homepage of amazon
      When user login to amazon
      And user Search desk lamp in the search box
      And user verify search result page
      And user add the desired item to the basket
      And user increases the quantity by two
      Then user should validate items and the subtotal

