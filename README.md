# Spring6DI
Dependency Injection project for Spring Framework Guru course

This attempts to use Profiles to specify which GreetingService implementation to use - something I've run into though is that if 
there's a GreetingService implementation class that *doesn't* have a Profile specified, that gets swept up with the ActiveProfile 
that's specified in the Test class. 

Does anyone know how to disable that, or do I need to put a profile on everything if I'm using prfiles?
