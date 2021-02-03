# Status Design Pattern

## Definination
**State** is a behavioral design pattern that lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.


## When To Use
- Use the State pattern when you have an object that behaves differently depending on its current state, the number of states is enormous, and the state-specific code changes frequently.
- Use the pattern when you have a class polluted with massive ***if-else*** conditionals that alter how the class behaves according to the current values of the class’s fields.


## Design Participants
- **State** : The interface define operations which each state must handle. 
- **Concrete States** : The classes which contain the state specific behavior.
- **Context** : Defines an interface to client to interact. It maintains references to concrete state object which may be used to define current state of object. It delegates state-specific behavior to different State objects.


## Reference Documentation
- https://refactoring.guru/design-patterns/state
- https://howtodoinjava.com/design-patterns/behavioral/state-design-pattern/
- https://sourcemaking.com/design_patterns/state


## Reference Code
- https://refactoring.guru/design-patterns/state/java/example
- https://sourcemaking.com/design_patterns/state/java/3
