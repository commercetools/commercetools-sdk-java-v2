
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLDiscountCodeNonApplicableErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLDiscountCodeNonApplicableError graphQLDiscountCodeNonApplicableError = GraphQLDiscountCodeNonApplicableError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLDiscountCodeNonApplicableErrorBuilder implements Builder<GraphQLDiscountCodeNonApplicableError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    @Nullable
    private String discountCode;

    @Nullable
    private String reason;

    @Nullable
    private String discountCodeId;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    @Nullable
    private java.time.ZonedDateTime validityCheckTime;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLDiscountCodeNonApplicableErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLDiscountCodeNonApplicableErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Discount Code passed to the Cart.</p>
     * @param discountCode value to be set
     * @return Builder
     */

    public GraphQLDiscountCodeNonApplicableErrorBuilder discountCode(@Nullable final String discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    /**
     *  <p><code>"DoesNotExist"</code> or <code>"TimeRangeNonApplicable"</code></p>
     * @param reason value to be set
     * @return Builder
     */

    public GraphQLDiscountCodeNonApplicableErrorBuilder reason(@Nullable final String reason) {
        this.reason = reason;
        return this;
    }

    /**
     *  <p>Unique identifier of the Discount Code.</p>
     * @param discountCodeId value to be set
     * @return Builder
     */

    public GraphQLDiscountCodeNonApplicableErrorBuilder discountCodeId(@Nullable final String discountCodeId) {
        this.discountCodeId = discountCodeId;
        return this;
    }

    /**
     *  <p>Date and time (UTC) from which the Discount Code is valid.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public GraphQLDiscountCodeNonApplicableErrorBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Date and time (UTC) until which the Discount Code is valid.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public GraphQLDiscountCodeNonApplicableErrorBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Discount Code validity check was last performed.</p>
     * @param validityCheckTime value to be set
     * @return Builder
     */

    public GraphQLDiscountCodeNonApplicableErrorBuilder validityCheckTime(
            @Nullable final java.time.ZonedDateTime validityCheckTime) {
        this.validityCheckTime = validityCheckTime;
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
     *  <p>Discount Code passed to the Cart.</p>
     * @return discountCode
     */

    @Nullable
    public String getDiscountCode() {
        return this.discountCode;
    }

    /**
     *  <p><code>"DoesNotExist"</code> or <code>"TimeRangeNonApplicable"</code></p>
     * @return reason
     */

    @Nullable
    public String getReason() {
        return this.reason;
    }

    /**
     *  <p>Unique identifier of the Discount Code.</p>
     * @return discountCodeId
     */

    @Nullable
    public String getDiscountCodeId() {
        return this.discountCodeId;
    }

    /**
     *  <p>Date and time (UTC) from which the Discount Code is valid.</p>
     * @return validFrom
     */

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Date and time (UTC) until which the Discount Code is valid.</p>
     * @return validUntil
     */

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>Date and time (UTC) the Discount Code validity check was last performed.</p>
     * @return validityCheckTime
     */

    @Nullable
    public java.time.ZonedDateTime getValidityCheckTime() {
        return this.validityCheckTime;
    }

    /**
     * builds GraphQLDiscountCodeNonApplicableError with checking for non-null required values
     * @return GraphQLDiscountCodeNonApplicableError
     */
    public GraphQLDiscountCodeNonApplicableError build() {
        return new GraphQLDiscountCodeNonApplicableErrorImpl(values, discountCode, reason, discountCodeId, validFrom,
            validUntil, validityCheckTime);
    }

    /**
     * builds GraphQLDiscountCodeNonApplicableError without checking for non-null required values
     * @return GraphQLDiscountCodeNonApplicableError
     */
    public GraphQLDiscountCodeNonApplicableError buildUnchecked() {
        return new GraphQLDiscountCodeNonApplicableErrorImpl(values, discountCode, reason, discountCodeId, validFrom,
            validUntil, validityCheckTime);
    }

    /**
     * factory method for an instance of GraphQLDiscountCodeNonApplicableErrorBuilder
     * @return builder
     */
    public static GraphQLDiscountCodeNonApplicableErrorBuilder of() {
        return new GraphQLDiscountCodeNonApplicableErrorBuilder();
    }

    /**
     * create builder for GraphQLDiscountCodeNonApplicableError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLDiscountCodeNonApplicableErrorBuilder of(
            final GraphQLDiscountCodeNonApplicableError template) {
        GraphQLDiscountCodeNonApplicableErrorBuilder builder = new GraphQLDiscountCodeNonApplicableErrorBuilder();
        builder.values = template.values();
        builder.discountCode = template.getDiscountCode();
        builder.reason = template.getReason();
        builder.discountCodeId = template.getDiscountCodeId();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.validityCheckTime = template.getValidityCheckTime();
        return builder;
    }

}
