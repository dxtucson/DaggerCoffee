# DaggerCoffee
<br />A simple project to understand how Dagger works.
<br />Modules can be viewed as providers. They define how things are provided.
<br />Classes with @Inject annotations are receptors, where dependencies can be injected to by Dagger.
<br />Components are maps of dependencies. We define what injections Dagger should take care for us in components. We write components as interfaces, Dagger will generate the implementation code for us.
