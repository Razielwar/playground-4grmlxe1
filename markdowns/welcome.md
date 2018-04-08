# Java 8 Streams : Practice!

This playground is dedicated to java developers to quickly practice with the Java 8 Streams API.

# Give it a try

@[Luke, how many stars are there in these galaxies?]({"stubs": ["src/main/java/com/razielwar/streams/Universe.java"], "command": "com.razielwar.streams.UniverseTest#test"})

# Stream Creation, Filtering, Mapping, Sorting practice

You will have to create and manipulate a String Stream.

Here's the content of the first stream to create:
Anakin Skywalker, Luke Skywalker, Leia Organa, Han Solo, Obi-wan Kenobi

@[Could you provide a stream containing the previous names?]({"stubs": ["src/main/java/com/razielwar/streams/StreamCreation.java"], "command": "com.razielwar.streams.StreamCreationTest#test"})

Now it is time to manipulate it!

@[Could you convert these names in an uppercase sorted stream?]({"stubs": ["src/main/java/com/razielwar/streams/NamesToUppercase.java"], "command": "com.razielwar.streams.NamesToUppercaseTest#test"})

And now why not collecting the stream to provide a useful data?

@[Could you return a string containing only compound names sorted formated as follow {name1, ..., ..nameN}?]({"stubs": ["src/main/java/com/razielwar/streams/NamesFiltered.java"], "command": "com.razielwar.streams.NamesFilteredTest#test"})