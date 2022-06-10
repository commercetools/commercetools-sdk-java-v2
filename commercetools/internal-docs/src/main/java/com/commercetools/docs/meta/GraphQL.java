
package com.commercetools.docs.meta;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.graph_ql.GraphQLRequest;

import io.vrap.rmf.base.client.oauth2.ClientCredentials;

/**
 * The SDK provides support for the usage of the GraphQL endpoint. As GraphQL is a query language itself
 * the SDK can't map the responses to a class model automatically.
 *
 * {@include.example example.GraphQLTest#graphql(com.commercetools.api.models.product.Product)}
 *
 * In case a result model class exists the class reference can be given to the execute method so that
 * the response will be mapped accordingly.
 *
 * {@include.example example.GraphQLTest#graphqlMapToClass(com.commercetools.api.models.product.Product)}
 */
public class GraphQL {
}
