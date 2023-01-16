# DogAPI

All ports are set to localhost:8080

This project works by mapping specific URL paths to return specific ArrayLists sorted by property. 
The default URL path localhost:8080/dog will display an ArrayList of all Dogs in the database.
This will display the name & breed.

From here you can add a ./... to specify your search by breed & name...

ex: localhost:8080/dog/frankie
will display an ArrayList of all Dogs in the dog database who's name is Frankie

ex: localhost:8080/dog/bulldog
will display an ArrayList of all Dogs in the dog database who's breed is Bulldog

This works by, for every specific path the main database will be passed through and for every matching attribute
that specific object will be added to a new ArrayList and that new ArrayList will be returned.

Here is the list of all the names/breeds in the database

*You will notice that I purposely named each breed the same three names to in order to demonstrate 
that my API is accurately returning the requested response.* 

[{"name":"frankie","breed":"poodle"},
{"name":"bobers","breed":"poodle"},
{"name":"jimmin","breed":"poodle"},

{"name":"frankie","breed":"german-shepard"},
{"name":"bobers","breed":"german-shepard"},
{"name":"jimmin","breed":"german-shepard"},

{"name":"frankie","breed":"siberian-husky"},
{"name":"bobers","breed":"siberian-husky"},
{"name":"jimmin","breed":"siberian-husky"},

{"name":"frankie","breed":"bulldog"},
{"name":"bobers","breed":"bulldog"},
{"name":"jimmin","breed":"bulldog"},

{"name":"frankie","breed":"golden-retriver"},
{"name":"bobers","breed":"golden-retriver"},
{"name":"jimmin","breed":"golden-retriver"},

{"name":"frankie","breed":"beagle"},
{"name":"bobers","breed":"beagle"},
{"name":"jimmin","breed":"beagle"},

{"name":"frankie","breed":"chihuahua"},
{"name":"bobers","breed":"chihuahua"},
{"name":"jimmin","breed":"chihuahua"}]

Here are all the possible URL's:

###BREED
http://localhost:8080/dog
http://localhost:8080/dog/poodle
http://localhost:8080/dog/german-shepard
http://localhost:8080/dog/siberian-husky
http://localhost:8080/dog/bulldog
http://localhost:8080/dog/golden-retriver
http://localhost:8080/dog/beagle
http://localhost:8080/dog/chihuahua

###NAME
http://localhost:8080/dog/frankie
http://localhost:8080/dog/bobers
http://localhost:8080/dog/jimmin
