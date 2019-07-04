# DaggerCoffee
<br />
Since I heard the concept of dependency injection for the first time, I always wanted to create a simple project in Eclipse to test whether I understand the concepts correctly.
<br />
It turned out so hard... 2 years after using Dagger in Android apps, I returned to this topic and created this repo.
<br />
So there are 6 jars to be added to Build Path and Factory Path:
<br />
dagger-2.9.jar<br />
dagger-compiler-2.9.jar<br />
dagger-producers-2.9.jar<br />
guava-20.0-rc1.jar<br />
javax.inject-1.jar<br />
javax.annotation-api-1.2.jar
<br />
I have to give credit to:
https://my.oschina.net/ArvinChu/blog/861538
<br />

Modules can be viewed as providers, we define how to provide things in modules.
<br />Classes with @Inject annotations are receptors, where dependencies can be injected to by Dagger.
<br />Components are maps of dependencies, we define what injections Dagger should take care for us in components. We write components as interfaces, Dagger will generate the implementation code for us.
