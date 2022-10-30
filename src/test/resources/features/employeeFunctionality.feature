  Feature: User should be able create an New Employee's profile

  Background: user is on the login page
    Given user is logged in the login page

    @CENT-1314

    Scenario Template: User can create a new New Employee's profile

      When user clicks Employees module
      And  user clicks Create button
      Then user clicks Edit button on image input box
      And  user uploads a photograph from their documents in their device
      Then user clicks Employee Name input box
      And  user enters <Employee name> into input box
      Then user clicks the arrow from Part Time drop down menu
      And  user selects <Employee>
      Then user clicks Work Address input box
      And  user enters <Work Address> into input box
      Then user clicks Work Location input box
      And  user enters <work location>
      Then user clicks Work Email input box
      And  user enters <work email>
      Then user clicks Work Mobile input box
      And  user enters work mobile
      Then user clicks Work phone input box
      And  user enters work phone
      Then user clicks the arrow from Department drop down menu
      And  selects Management
      Then user clicks the arrow from Job Position drop down menu and selects SDET
      Then user clicks the arrow from Manager drop down menu And selects 'Adelina'
      Then User clicks the arrow from Coach drop down menu
      And  user selects 'Adalberto Hudson'
      And  user clicks the arrow Working Hours down menu
      And  user selects <Standard 40 hours/week>
      Then user clicks save button

      Examples: Input
      |Employee Name | Department |
      |Zebs Nisa     | Employee   |

      @CENT-1322

      Scenario: User cannot create an Employee without typing name (empty name)

        When user clicks Employees module
        And  user clicks Create button
        Then user clicks the arrow Working Hours down menu
        And  user selects 'Standard 40 hours/week'
        Then user clicks save button to view the error message


       @CENT-1326

       Scenario: User can cancel creating by clicking Discard button

         When user clicks Employees module
         And  user clicks Create button
         Then user clicks Employee Name input box
         And  user enters Employee name into input box
         And  user clicks Discard button
         Then user clicks ok button

        @CENT-1324

        Scenario:  User should see page title has changed to the new Employee name after user create the Employee


          When user clicks Employees module
          And  user clicks Create button
          And  user clicks Employee Name input box
          And  user enters <Employee name> into input box
          Then user will  click save and see title changed to "<Expected Title>"


        @CENT-1325

        Scenario: User will see “Employee created” message is displayed at the bottom of the page
          When user clicks Employees module
          And  user clicks Create button
          And  user clicks Employee Name input box
          And  user enters <Employee name> into input box
          Then user clicks save button and user will see “Employee created” message is displayed at the bottom of the page


         @CENT-1328

         Scenario: User should find the new created Employee under Employee list by using search box
           When user clicks Employees module
           And  user clicks Create button
           And  user clicks Employee Name input box
           And  user enters <Employee name> into input box
           And  user clicks search button
           And  user enters 'Zebs' into the search input box
           Then user find the new created employee under Employee list

         @CENT-1331

         Scenario: User can change Employee display to Kanban / List
           When user clicks Employees module
           And user clicks list button
           And a list of Employees will be displayed
           Then user clicks kanban button


           @CENT-1332

           Scenario: User will see all Employee numbers has increased by one
             When user clicks Employees module
             And  user clicks Create button
             And  user clicks Employee Name input box
             And  user enters <Employee name> into input box
             And  user clicks save button
             And user clicks employee button
             Then user click list and number increased by one







