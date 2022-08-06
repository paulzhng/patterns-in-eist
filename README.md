# EIST Patterns

A collection of patterns taught in EIST applied using one common domain: Cars.

## Patterns

- [Adapter Pattern](src/de/paulzhng/eist/adapter/adapter.md)
- [Bridge Pattern](src/de/paulzhng/eist/bridge/bridge.md)
- [Composite Pattern](src/de/paulzhng/eist/composite/composite.md)
- [Facade Pattern](src/de/paulzhng/eist/facade/facade.md)
- [Observer Pattern](src/de/paulzhng/eist/observer/observer.md)
- [Proxy Pattern](src/de/paulzhng/eist/proxy/proxy.md)
- [Strategy Pattern](src/de/paulzhng/eist/strategy/strategy.md)
- [Template Method Pattern](src/de/paulzhng/eist/templatemethod/template-method.md)

## Clues for deciding which pattern to use

Adapted from the EIST lecture.

- "complex structure", "must have variable depth and width": [Composite Pattern](src/de/paulzhng/eist/composite/composite.md)
- "must provide a policy independent of the mechanism", "must allow to change algorithms at runtime": [Strategy Pattern](src/de/paulzhng/eist/strategy/strategy.md)
- "must be location transparent": [Proxy Pattern](src/de/paulzhng/eist/proxy/proxy.md)
- "states must be synchronized", "many systems must be notified": [Observer Pattern](src/de/paulzhng/eist/observer/observer.md)
- "must interface with an existing object": [Adapter Pattern](src/de/paulzhng/eist/adapter/adapter.md)
- "must interface to several systems, some of them to be developed in the future", "an early prototype must be demonstrated", "must provide backward compatibility": [Bridge Pattern](src/de/paulzhng/eist/bridge/bridge.md)
- "must interface to an existing set of objects", "must interface to an existing API", "must interface to an existing service": [Facade Pattern](src/de/paulzhng/eist/facade/facade.md)