
package com.commercetools.docs.meta;

/**
 * {@include.toc}
 * <h2 id="querying-api">Querying the API</h2>
 *
 * <h3 id="predicates">Predicates</h3>
 *
 * <p>The system allows the use of <a href="https://docs.commercetools.com/api/predicates/query">predicates</a> when
 * querying the API. Predicates are added as query parameter string to the request itself. The following example shows
 * the usage of <a href="https://docs.commercetools.com/api/predicates/query#input-variable-examples">input variables</a></p>
 *
 * {@include.example example.ExamplesTest#queryPredicateVariable()}
 *
 * It's also possible to use array values in predicates in case of a varying number of parameters
 *
 * {@include.example example.ExamplesTest#queryPredicateVariableArray()}
 *
 <h3 id="query-predicate-builder">Query Predicate Builder</h3>
 *
 * <p>The <a href="https://docs.commercetools.com/sdk/java-sdk-predicates">
 * Query Predicate Builder</a> offers a fluent, type-safe interface for building Query Predicates.</p>
 *
 * <h4>Basic Usage</h4>
 *
 * <pre>{@code
 * import static com.commercetools.api.predicates.query.CustomerQueryBuilderDsl.*;
 *
 * String predicate = CustomerQueryBuilderDsl.of()
 *       .firstName().is("John")
 *       .and()
 *       .lastName().is("Doe")
 *       .build();
 * }</pre>
 *
 * <h4>Examples of Query Predicates</h4>
 *
 * <p>The following examples demonstrate how to use the Query Predicate builder for different scenarios. More examples can be found
 * <a href="https://github.com/commercetools/commercetools-sdk-java-v2/tree/main/commercetools/commercetools-sdk-java-api/src/test/java/com/commercetools/api/predicates/query">here</a>.</p>
 *
 * <h5>Equality Comparisons</h5>
 * <pre>{@code
 * CartQueryBuilderDsl.of().id().is("abc");
 * CustomerQueryBuilderDsl.of().dateOfBirth().is(LocalDate.parse("2018-10-12"));
 * TaxRateQueryBuilderDsl.of().amount().is(10.0);
 * }</pre>
 *
 * <h5>Logical Operators</h5>
 * <pre>{@code
 * CartQueryBuilderDsl.of().id().is("abc").not();
 * CartQueryBuilderDsl.of().id().is("abc").and(p -> p.id().is("def"));
 * CartQueryBuilderDsl.of().id().is("abc").or(p -> p.id().is("def"));
 * }</pre>
 *
 * <h5>Range Comparisons</h5>
 * <pre>{@code
 * CartQueryBuilderDsl.of().version().isLessThan(10L);
 * CartQueryBuilderDsl.of().version().isGreaterThan(10L);
 * TaxRateQueryBuilderDsl.of().amount().isLessThan(10.0);
 * CustomerQueryBuilderDsl.of().dateOfBirth().isGreaterThan(LocalDate.parse("2018-10-12"));
 * }</pre>
 *
 * <h5>Collection Queries</h5>
 * <pre>{@code
 * CartQueryBuilderDsl.of().key().isIn(Arrays.asList("foo", "bar"));
 * TaxRateQueryBuilderDsl.of().amount().isIn(Arrays.asList(10.0, 20.0));
 * }</pre>
 *
 * <h5>Nested Queries</h5>
 * <pre>{@code
 * ProductQueryBuilderDsl.of()
 *   .masterData(m -> m.current(c -> c.slug(l -> l.with(Locale.ENGLISH).is("super-product"))
 *     .and(t -> t.name(l -> l.with(Locale.ENGLISH).is("Super Product")))));
 * }</pre>
 *
 * <h5>Special Cases</h5>
 * <pre>{@code
 * CartQueryBuilderDsl.of().key().isDefined();
 * CartQueryBuilderDsl.of().key().isNotDefined();
 * CartQueryBuilderDsl.of().lineItems().isEmpty();
 * TypeQueryBuilderDsl.of().resourceTypeIds().containsAnyVar("foo");
 * }</pre>
 *
 *
 * <h3 id="get-by-id">Get by id/key</h3>
 *
 * {@include.example example.ExamplesTest#getByIdOrKey()}
 *
 * <h3 id="query-all">Query all</h3>
 *
 * {@include.example example.ExamplesTest#queryAll()}
 *
 * <h3 id="sorting">Sorting</h3>
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
 * <h3 id="pagination">Pagination</h3>
 *
 * <p>Limiting the number of the returned documents or page size:</p>
 *
 * {@include.example example.ExamplesTest#limitPagination()}
 *
 * <p>To retrieve the next results use the offset parameter. The example shows how to retrieve page 2:</p>
 *
 * {@include.example example.ExamplesTest#limitOffsetPagination()}
 *
 * <h2 id="tests">Test cases</h2>
 *
 * <p>The repository has test cases for each endpoint and query parameter. Please see in the following folder:
 * <a href="https://github.com/commercetools/commercetools-sdk-java-v2/tree/main/commercetools/commercetools-sdk-java-api/src/test/java-generated/com/commercetools/api/client/resource">Resource test cases</a></p>
 *
 * <p>For more real world test cases you may also look into the integration test suite:
 * <a href="https://github.com/commercetools/commercetools-sdk-java-v2/tree/main/commercetools/commercetools-sdk-java-api/src/integrationTest/java/commercetools">Integration test cases</a></p>
 */
public class Querying {
}
