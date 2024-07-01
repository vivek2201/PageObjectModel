Feature: Add To Cart 

  Scenario: Add single product into the cart
      Given Customer is already in homepage
      When User add a Cucumber into the Cart
      And Click on Cart icon
      Then Validate 1kg Cucumber is added to the cart
      And Price is 48rs
