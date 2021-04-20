Feature: Open Deposit Account Fees pdf

  Scenario: Open pdf successful
    Given that the actor enters banistmo
    When he enters the tariff menu and open the PDF
    Then he should see the pdf open in another tab with the rates
