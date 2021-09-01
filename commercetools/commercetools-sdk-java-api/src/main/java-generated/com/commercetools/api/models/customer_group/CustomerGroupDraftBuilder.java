
package com.commercetools.api.models.customer_group;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerGroupDraftBuilder implements Builder<CustomerGroupDraft> {

    @Nullable
    private String key;

    private String groupName;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    public CustomerGroupDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public CustomerGroupDraftBuilder groupName(final String groupName) {
        this.groupName = groupName;
        return this;
    }

    public CustomerGroupDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    public CustomerGroupDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public String getGroupName() {
        return this.groupName;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public CustomerGroupDraft build() {
        Objects.requireNonNull(groupName, CustomerGroupDraft.class + ": groupName is missing");
        return new CustomerGroupDraftImpl(key, groupName, custom);
    }

    /**
     * builds CustomerGroupDraft without checking for non null required values
     */
    public CustomerGroupDraft buildUnchecked() {
        return new CustomerGroupDraftImpl(key, groupName, custom);
    }

    public static CustomerGroupDraftBuilder of() {
        return new CustomerGroupDraftBuilder();
    }

    public static CustomerGroupDraftBuilder of(final CustomerGroupDraft template) {
        CustomerGroupDraftBuilder builder = new CustomerGroupDraftBuilder();
        builder.key = template.getKey();
        builder.groupName = template.getGroupName();
        builder.custom = template.getCustom();
        return builder;
    }

}
