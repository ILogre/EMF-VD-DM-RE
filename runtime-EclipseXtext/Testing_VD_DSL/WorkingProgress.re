Project: WorkingProgress
Background:
Given dashboard WorkingCondition
with views
overview to 'get a general idea about the office environment'
summer to 'monitor the air conditioning and the pollution'
hiver to 'monitor the heating system and the lights'
surounding to 'analyze the noise impact on work'

Feature: overallNavigability in order to 'set the transition between the views'

Scenario: 'From the beginning'
When overview is Current
Then summer is Enable
And hiver is Enable
And surounding is Enable

Scenario: 'In summertime'
When summer is Current
Then hiver is Disable

Scenario: 'If snowflake'
When hiver is Current
Then summer is Disable

Feature: interaction in order to 'handle the behavior between visualization'

Scenario: 'Synchronization of time'
When range performed selected in hiver
Then surounding is Synchronize

