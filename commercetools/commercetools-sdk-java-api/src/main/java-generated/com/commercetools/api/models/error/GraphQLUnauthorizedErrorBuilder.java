
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLUnauthorizedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLUnauthorizedError graphQLUnauthorizedError = GraphQLUnauthorizedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLUnauthorizedErrorBuilder implements Builder<GraphQLUnauthorizedError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    @Nullable
    private java.util.List<String> storesWithoutPermission;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLUnauthorizedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLUnauthorizedErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Keys of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> for which the required permission to modify is missing.</p>
     *  <p>This field is returned only for <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a>.</p>
     * @param storesWithoutPermission value to be set
     * @return Builder
     */

    public GraphQLUnauthorizedErrorBuilder storesWithoutPermission(@Nullable final String... storesWithoutPermission) {
        this.storesWithoutPermission = new ArrayList<>(Arrays.asList(storesWithoutPermission));
        return this;
    }

    /**
     *  <p>Keys of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> for which the required permission to modify is missing.</p>
     *  <p>This field is returned only for <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a>.</p>
     * @param storesWithoutPermission value to be set
     * @return Builder
     */

    public GraphQLUnauthorizedErrorBuilder storesWithoutPermission(
            @Nullable final java.util.List<String> storesWithoutPermission) {
        this.storesWithoutPermission = storesWithoutPermission;
        return this;
    }

    /**
     *  <p>Keys of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> for which the required permission to modify is missing.</p>
     *  <p>This field is returned only for <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a>.</p>
     * @param storesWithoutPermission value to be set
     * @return Builder
     */

    public GraphQLUnauthorizedErrorBuilder plusStoresWithoutPermission(
            @Nullable final String... storesWithoutPermission) {
        if (this.storesWithoutPermission == null) {
            this.storesWithoutPermission = new ArrayList<>();
        }
        this.storesWithoutPermission.addAll(Arrays.asList(storesWithoutPermission));
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    /**
     *  <p>Keys of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> for which the required permission to modify is missing.</p>
     *  <p>This field is returned only for <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a>.</p>
     * @return storesWithoutPermission
     */

    @Nullable
    public java.util.List<String> getStoresWithoutPermission() {
        return this.storesWithoutPermission;
    }

    /**
     * builds GraphQLUnauthorizedError with checking for non-null required values
     * @return GraphQLUnauthorizedError
     */
    public GraphQLUnauthorizedError build() {
        return new GraphQLUnauthorizedErrorImpl(values, storesWithoutPermission);
    }

    /**
     * builds GraphQLUnauthorizedError without checking for non-null required values
     * @return GraphQLUnauthorizedError
     */
    public GraphQLUnauthorizedError buildUnchecked() {
        return new GraphQLUnauthorizedErrorImpl(values, storesWithoutPermission);
    }

    /**
     * factory method for an instance of GraphQLUnauthorizedErrorBuilder
     * @return builder
     */
    public static GraphQLUnauthorizedErrorBuilder of() {
        return new GraphQLUnauthorizedErrorBuilder();
    }

    /**
     * create builder for GraphQLUnauthorizedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLUnauthorizedErrorBuilder of(final GraphQLUnauthorizedError template) {
        GraphQLUnauthorizedErrorBuilder builder = new GraphQLUnauthorizedErrorBuilder();
        builder.values = template.values();
        builder.storesWithoutPermission = template.getStoresWithoutPermission();
        return builder;
    }

}
