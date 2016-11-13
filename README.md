# FindDoctorsSimilar
Practice Fusion Code 

A site contains a listing of doctors. Users can browse for doctors given a specific specialty, area, review score etc.
You need to help write the logic for returning similar doctors.  Specifically, write a class(es) which when given a doctor, provides a list of similar doctors, in a prioritized order. You define what similar means and the result ordering but clearly document any assumptions in your code.  Please include unit tests. You can assume the entire directory of doctors fits into memory.  Write in whatever language you're most comfortable with. 
Aim to spend 30 minutes on this coding challenge. We are not expecting you to create an entire hosted site, just the class for the algorithm for finding similar doctors and associated unit tests. If applicable, note down any remaining thoughts or things you would want to improve on with more time. 





The solution takes in a specific doctor and a set of criteria(s) if provided and returns the list of all doctors that match the criteria or all the criterias in the criteria list (its an AND operation, meaning only if the criteria1 && criteria2 && criteria3 ....... satisfies).
If no criteria is provided, the similarity is decided on all the parameters of Doctor class. Meaning only if two doctors match with respect to each and every criteria. 

Given extra time , would love to incorporate these features - 
read more input values dynamically 
define sorting based on more attributes 
also add search similar doctors based on distance (right now, the service supports only specific location)
Provide more options for criteria instead of just a list
