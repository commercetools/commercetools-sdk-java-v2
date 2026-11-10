
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned when a bulk request contains more items than the allowed maximum.</p>
 *  <p>Reduce the number of items in the request to at most <code>limit</code> and retry.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BulkOperationMaxItemsExceededError bulkOperationMaxItemsExceededError = BulkOperationMaxItemsExceededError.builder()
 *             .message("{message}")
 *             .limit(0.3)
 *             .provided(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BulkOperationMaxItemsExceeded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BulkOperationMaxItemsExceededErrorImpl.class)
public interface BulkOperationMaxItemsExceededError extends ErrorObject {

    /**
     * discriminator value for BulkOperationMaxItemsExceededError
     */
    String BULK_OPERATION_MAX_ITEMS_EXCEEDED = "BulkOperationMaxItemsExceeded";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The bulk request exceeds the maximum allowed items of $limit."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Maximum number of items allowed in a single bulk request.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Integer getLimit();

    /**
     *  <p>Number of items provided in the request.</p>
     * @return provided
     */
    @NotNull
    @JsonProperty("provided")
    public Integer getProvided();

    /**
     *  <p><code>"The bulk request exceeds the maximum allowed items of $limit."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Maximum number of items allowed in a single bulk request.</p>
     * @param limit value to be set
     */

    public void setLimit(final Integer limit);

    /**
     *  <p>Number of items provided in the request.</p>
     * @param provided value to be set
     */

    public void setProvided(final Integer provided);

    /**
     * factory method
     * @return instance of BulkOperationMaxItemsExceededError
     */
    public static BulkOperationMaxItemsExceededError of() {
        return new BulkOperationMaxItemsExceededErrorImpl();
    }

    /**
     * factory method to create a shallow copy BulkOperationMaxItemsExceededError
     * @param template instance to be copied
     * @return copy instance
     */
    public static BulkOperationMaxItemsExceededError of(final BulkOperationMaxItemsExceededError template) {
        BulkOperationMaxItemsExceededErrorImpl instance = new BulkOperationMaxItemsExceededErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setLimit(template.getLimit());
        instance.setProvided(template.getProvided());
        return instance;
    }

    public BulkOperationMaxItemsExceededError copyDeep();

    /**
     * factory method to create a deep copy of BulkOperationMaxItemsExceededError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BulkOperationMaxItemsExceededError deepCopy(
            @Nullable final BulkOperationMaxItemsExceededError template) {
        if (template == null) {
            return null;
        }
        BulkOperationMaxItemsExceededErrorImpl instance = new BulkOperationMaxItemsExceededErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setLimit(template.getLimit());
        instance.setProvided(template.getProvided());
        return instance;
    }

    /**
     * builder factory method for BulkOperationMaxItemsExceededError
     * @return builder
     */
    public static BulkOperationMaxItemsExceededErrorBuilder builder() {
        return BulkOperationMaxItemsExceededErrorBuilder.of();
    }

    /**
     * create builder for BulkOperationMaxItemsExceededError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BulkOperationMaxItemsExceededErrorBuilder builder(final BulkOperationMaxItemsExceededError template) {
        return BulkOperationMaxItemsExceededErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBulkOperationMaxItemsExceededError(Function<BulkOperationMaxItemsExceededError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<BulkOperationMaxItemsExceededError> typeReference() {
        return new tools.jackson.core.type.TypeReference<BulkOperationMaxItemsExceededError>() {
            @Override
            public String toString() {
                return "TypeReference<BulkOperationMaxItemsExceededError>";
            }
        };
    }
}
