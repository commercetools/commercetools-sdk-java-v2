
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PayloadNotIncludedBuilder implements Builder<PayloadNotIncluded> {

    private String reason;

    private String payloadType;

    public PayloadNotIncludedBuilder reason(final String reason) {
        this.reason = reason;
        return this;
    }

    public PayloadNotIncludedBuilder payloadType(final String payloadType) {
        this.payloadType = payloadType;
        return this;
    }

    public String getReason() {
        return this.reason;
    }

    public String getPayloadType() {
        return this.payloadType;
    }

    public PayloadNotIncluded build() {
        Objects.requireNonNull(reason, PayloadNotIncluded.class + ": reason is missing");
        Objects.requireNonNull(payloadType, PayloadNotIncluded.class + ": payloadType is missing");
        return new PayloadNotIncludedImpl(reason, payloadType);
    }

    /**
     * builds PayloadNotIncluded without checking for non null required values
     */
    public PayloadNotIncluded buildUnchecked() {
        return new PayloadNotIncludedImpl(reason, payloadType);
    }

    public static PayloadNotIncludedBuilder of() {
        return new PayloadNotIncludedBuilder();
    }

    public static PayloadNotIncludedBuilder of(final PayloadNotIncluded template) {
        PayloadNotIncludedBuilder builder = new PayloadNotIncludedBuilder();
        builder.reason = template.getReason();
        builder.payloadType = template.getPayloadType();
        return builder;
    }

}
