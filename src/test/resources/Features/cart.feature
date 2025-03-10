@CartTest
Feature: Cart Functionality

  Background:
    Given the user is logged into the DemoBlaze website

  Scenario: User adds a product to the cart
    When the user navigates to a product page
    And the user clicks the "Add to Cart" button
    Then the product should be added to the cart
    And the cart should display the correct product details
