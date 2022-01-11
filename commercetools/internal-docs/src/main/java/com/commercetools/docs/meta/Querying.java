
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
 *
 * <h3>Sorting</h3>
 *
 * <p>Please see <a href="https://docs.commercetools.com/api/general-concepts#sorting">Sort</a> for details</p>
 *
 * <p>Sorting using one parameter:</p>
 *
 * {@include.example example.ExamplesTest#simpleSort()}
 *
 * <p>Sorting using multiple parameters:</p>
 *
 * {@include.example example.ExamplesTest#multiSort()}
 *
 * <h3 id=pagination>Pagination</h3>
 *
 * <p>Limiting the number of the returned documents or page size:</p>
 *
 * {@include.example example.ExamplesTest#limitPagination()}
 *
 * <p>To retrieve the next results use the offset parameter. The example shows how to retrieve page 2:</p>
 *
 * {@include.example example.ExamplesTest#limitOffsetPagination()}
 */
public class Querying {
}
