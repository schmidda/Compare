# Compare

Compare is a Java webapp that can be deployed in an application container like Tomcat, or 
it can be debugged in embedded form using Jetty. What it does is compare two versions of a 
multi-version document and merge the differences into the markup for the text. It then 
returns a HTML string containing the merged markup+text+differences. It should be used in 
conjunction with the [compare Drupal 
module](https://github.com/Ecdosis/ecdosis-front/tree/master/compare), which displays the 
result in a two-way or three-way view.
