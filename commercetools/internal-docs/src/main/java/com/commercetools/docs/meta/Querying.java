
package com.commercetools.docs.meta;

/**
 * <h2>Querying the API</h2>
 *
 * <h3>Predicates</h3>
 *
 * <p>The platform allows the use of <a href="https://docs.commercetools.com/api/predicates/query">predicates</a> when
 * querying the API. Predicates are added as query parameter string to the request itself. The following example shows
 * the usage of <a href="https://docs.commercetools.com/api/predicates/query#input-variable-examples">input variables</a></p>
 *
 * {@include.example example.ExamplesTest#queryPredicateVariable()}
 *
 * It's also possible to use array values in predicates in case of a varying number of parameters
 *
 * {@include.example example.ExamplesTest#queryPredicateVariableArray()}
 *
 * <h3>Get by id/key</h3>
 *
 * {@include.example example.ExamplesTest#getByIdOrKey()}
 *
 * <h3>Query all</h3>
 *
 * {@include.example example.ExamplesTest#queryAll()}
 */
public class Querying {
}
