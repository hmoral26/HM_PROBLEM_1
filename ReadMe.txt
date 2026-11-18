Hurricane Prediction System - Problem 1

This program shows two design patterns:

Template Method: the abstract class sets the order of steps for predicting a hurricane. StatisticalPrediction and MachineLearningPrediction fill in the details differently.

Command: each action (fetch data, run prediction, save results) is a separate command. The invoker runs them in the order they were added.


Resources: Professor's Roy design patterns power points
People: none