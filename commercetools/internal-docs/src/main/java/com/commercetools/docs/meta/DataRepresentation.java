
package com.commercetools.docs.meta;

/**
 *
 * <h2>Representation</h2>
 *
 * The SDK provides types for each of the types described in the documentation of the REST API. Each type is represented
 * by an interface, an implementation class and a builder class.
 *
 * <h3>Interfaces</h3>
 *
 * The interface class describes the JSON structure by providing Getters and Setters. The necessary annotations to de-/serialize
 * the JSON is defined here.
 *
 * Each interface has a factory method to create an instance of the implementation class and to copy an instance.
 * {@include.example example.ExamplesTest#factoryMethod()}
 *
 * Also a model interface has a factory method to create a builder of a model instance or create a builder with the data of
 * the instance itself. E.g.:
 * {@include.example example.ExamplesTest#builderMethod()}
 *
 * And each interface has a method to apply a function to the instance itself. This can be used for custom defined accessors. E.g.:
 * {@include.example example.ExamplesTest#accessorTest()}
 *
 * The model interfaces define the inheritance/composition structure of all documented types.
 *
 * <h4>Polymorphic types</h4>
 *
 * Each polymorphic type interface provides methods for all it's subtype builders
 * {@include.example example.ExamplesTest#polymorphicInterface()}
 *
 * This can be used to build a whole update body
 *
 * {@include.example example.ExamplesTest#updateBodyInterface()}
 *
 * <h3>Builder</h3>
 *
 * For each type a builder class exists. Each property can be set using the method with the property name at the builder instance. E.g.:
 * {@include.example example.ExamplesTest#builderProperty()}
 *
 *
 * <h4>Object property</h4>
 *
 * If the property is an object type a method with a lambda function parameter is usable. The function is called with
 * a builder instance of the properties type.
 * {@include.example example.ExamplesTest#builderLambda()}
 *
 * <h4>Array property</h4>
 *
 * Array properties have additional methods for adding addtional elements and build element instances.
 * {@include.example example.ExamplesTest#builderArray()}
 *
 * <h4>Polymorphic types</h4>
 *
 * Each polymorphic type builder provides methods for all it's subtype builders
 * {@include.example example.ExamplesTest#polymorphicBuilder()}
 *
 * This can be used to build a whole update body
 *
 * {@include.example example.ExamplesTest#updateBodyBuilder()}

 *
 * <h3>Implementation</h3>
 *
 * Each type has an implementation class (POJO). The class implements all properties of all interfaces and it's getters and setters.
 * Also the implementation class implements an equals and hashcode method. The constructor is defined package private as
 * new properties could be added by the API.
 *
 * The method `reflectionString` is available for all implementation classes by the {@link io.vrap.rmf.base.client.ModelBase} interface.
 * This method will return a string representation of the instance.
 *
 * {@include.example example.ExamplesTest#reflectionString()}
 */
public class DataRepresentation {
}
