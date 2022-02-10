
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DiscountCodeNonApplicableErrorBuilder implements Builder<DiscountCodeNonApplicableError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    @Nullable
    private String discountCode;

    @Nullable
    private String reason;

    @Nullable
    private String dicountCodeId;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    @Nullable
    private java.time.ZonedDateTime validityCheckTime;

    public DiscountCodeNonApplicableErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public DiscountCodeNonApplicableErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public DiscountCodeNonApplicableErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public DiscountCodeNonApplicableErrorBuilder discountCode(@Nullable final String discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    public DiscountCodeNonApplicableErrorBuilder reason(@Nullable final String reason) {
        this.reason = reason;
        return this;
    }

    public DiscountCodeNonApplicableErrorBuilder dicountCodeId(@Nullable final String dicountCodeId) {
        this.dicountCodeId = dicountCodeId;
        return this;
    }

    public DiscountCodeNonApplicableErrorBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public DiscountCodeNonApplicableErrorBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    public DiscountCodeNonApplicableErrorBuilder validityCheckTime(
            @Nullable final java.time.ZonedDateTime validityCheckTime) {
        this.validityCheckTime = validityCheckTime;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    @Nullable
    public String getDiscountCode() {
        return this.discountCode;
    }

    @Nullable
    public String getReason() {
        return this.reason;
    }

    @Nullable
    public String getDicountCodeId() {
        return this.dicountCodeId;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    @Nullable
    public java.time.ZonedDateTime getValidityCheckTime() {
        return this.validityCheckTime;
    }

    public DiscountCodeNonApplicableError build() {
        Objects.requireNonNull(message, DiscountCodeNonApplicableError.class + ": message is missing");
        Objects.requireNonNull(values, DiscountCodeNonApplicableError.class + ": values are missing");
        return new DiscountCodeNonApplicableErrorImpl(message, values, discountCode, reason, dicountCodeId, validFrom,
            validUntil, validityCheckTime);
    }

    /**
     * builds DiscountCodeNonApplicableError without checking for non null required values
     */
    public DiscountCodeNonApplicableError buildUnchecked() {
        return new DiscountCodeNonApplicableErrorImpl(message, values, discountCode, reason, dicountCodeId, validFrom,
            validUntil, validityCheckTime);
    }

    public static DiscountCodeNonApplicableErrorBuilder of() {
        return new DiscountCodeNonApplicableErrorBuilder();
    }

    public static DiscountCodeNonApplicableErrorBuilder of(final DiscountCodeNonApplicableError template) {
        DiscountCodeNonApplicableErrorBuilder builder = new DiscountCodeNonApplicableErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.discountCode = template.getDiscountCode();
        builder.reason = template.getReason();
        builder.dicountCodeId = template.getDicountCodeId();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.validityCheckTime = template.getValidityCheckTime();
        return builder;
    }

}
