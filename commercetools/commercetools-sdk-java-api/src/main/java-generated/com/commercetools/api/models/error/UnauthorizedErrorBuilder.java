
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * UnauthorizedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UnauthorizedError unauthorizedError = UnauthorizedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class UnauthorizedErrorBuilder implements Builder<UnauthorizedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    @Nullable
    private java.util.List<String> storesWithoutPermission;

    /**
     *  <p><code>"Customer reference expansion not permitted on my business unit"</code> or <code>"Not allowed to edit this CartDiscount."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public UnauthorizedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public UnauthorizedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public UnauthorizedErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public UnauthorizedErrorBuilder storesWithoutPermission(@Nullable final String... storesWithoutPermission) {
        this.storesWithoutPermission = new ArrayList<>(Arrays.asList(storesWithoutPermission));
        return this;
    }

    /**
     *  <p>Keys of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> for which the required permission to modify is missing.</p>
     *  <p>This field is returned only for <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a>.</p>
     * @param storesWithoutPermission value to be set
     * @return Builder
     */

    public UnauthorizedErrorBuilder storesWithoutPermission(
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

    public UnauthorizedErrorBuilder plusStoresWithoutPermission(@Nullable final String... storesWithoutPermission) {
        if (this.storesWithoutPermission == null) {
            this.storesWithoutPermission = new ArrayList<>();
        }
        this.storesWithoutPermission.addAll(Arrays.asList(storesWithoutPermission));
        return this;
    }

    /**
     *  <p><code>"Customer reference expansion not permitted on my business unit"</code> or <code>"Not allowed to edit this CartDiscount."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
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
     * builds UnauthorizedError with checking for non-null required values
     * @return UnauthorizedError
     */
    public UnauthorizedError build() {
        Objects.requireNonNull(message, UnauthorizedError.class + ": message is missing");
        return new UnauthorizedErrorImpl(message, values, storesWithoutPermission);
    }

    /**
     * builds UnauthorizedError without checking for non-null required values
     * @return UnauthorizedError
     */
    public UnauthorizedError buildUnchecked() {
        return new UnauthorizedErrorImpl(message, values, storesWithoutPermission);
    }

    /**
     * factory method for an instance of UnauthorizedErrorBuilder
     * @return builder
     */
    public static UnauthorizedErrorBuilder of() {
        return new UnauthorizedErrorBuilder();
    }

    /**
     * create builder for UnauthorizedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static UnauthorizedErrorBuilder of(final UnauthorizedError template) {
        UnauthorizedErrorBuilder builder = new UnauthorizedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.storesWithoutPermission = template.getStoresWithoutPermission();
        return builder;
    }

}
