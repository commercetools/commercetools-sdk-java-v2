
package com.commercetools.docs.meta;

/**
 * <p>The SDK provides support for the usage of the GraphQL endpoint.</p>
 *
 * {@include.example example.GraphQLTest#graphql(com.commercetools.api.models.product.Product)}
 *
 * <p>In case a result model class exists the class reference can be given to the execute method so that
 * the response will be mapped accordingly.</p>
 *
 * {@include.example example.GraphQLTest#graphqlMapToClass(com.commercetools.api.models.product.Product)}
 *
 * <h2>GraphQL module</h2>
 *
 * <p>The SDK comes with a module for enhanced GraphQL support. With the help of the <a href="https://netflix.github.io/dgs/generating-code-from-schema/">DGS codegen</a>
 * we generate a type safe query and projection builder. The results will be mapped to the correct response type.</p>
 *
 * <p>The response types will have all available fields, but only the projected will be filled with a value.</p>
 *
 * <p>The {@link com.commercetools.graphql.api.GraphQL} class has factory methods for all available operations in the <a href="https://github.com/commercetools/commercetools-sdk-java-v2/blob/fdf750aeec3a33cbee463f5f3f14afd44b559c20/commercetools/commercetools-graphql-api/src/main/resources/graphql/schema.graphqls">GraphQL schema</a></p>
 *
 * {@include.example example.GraphQLModuleTest#queryBuilding}
 *
 * <p>The module provides a {@link com.commercetools.graphql.api.GraphQLModule Jackson module}. It's configured
 * as SPI and gets automatically registered to the SDKs {@link com.fasterxml.jackson.databind.ObjectMapper}. This module
 * will configure the ObjectMapper to deserialize the response data object as {@link com.commercetools.graphql.api.GraphQLData}
 * instance too and can access it's methods by casting it.</p>
 *
 * {@include.example example.GraphQLModuleTest#graphQLJacksonModule}

 * <p>Additionally for retrieving the result data it can be explicitly mapped to the {@link com.commercetools.graphql.api.GraphQLDataResponse} class which
 * uses the schema generated models.</p>
 *
 * {@include.example example.GraphQLModuleTest#responseData}
 *
 * <p>The GraphQLDataResponse provides a method to retrieve the operations result data</p>
 *
 * {@include.example example.GraphQLModuleTest#resultData}
 *
 */
public class GraphQL {
}
