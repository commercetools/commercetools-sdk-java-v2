package com.commercetools.api.models.customer_group;

import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.customer_group.CustomerGroupDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupDraft customerGroupDraft = CustomerGroupDraft.builder()
 *             .groupName("{groupName}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerGroupDraftBuilder implements Builder<CustomerGroupDraft> {

    
    @Nullable
    private String key;
    
    
    
    private String groupName;
    
    
    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    
    /**
     *  <p>User-defined unique identifier for the CustomerGroup.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public CustomerGroupDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    
    
    
    /**
     *  <p>Unique value which must be different from any value used for <code>name</code> in CustomerGroup in the Project. If not, a DuplicateField error is returned.</p>
     * @param groupName value to be set
     * @return Builder
     */
    
    public CustomerGroupDraftBuilder groupName( final String groupName) {
        this.groupName = groupName;
        return this;
    }
    
    
    
    
    /**
     *  <p>Custom Fields for the CustomerGroup.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public CustomerGroupDraftBuilder custom(Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Custom Fields for the CustomerGroup.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public CustomerGroupDraftBuilder withCustom(Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Custom Fields for the CustomerGroup.</p>
     * @param custom value to be set
     * @return Builder
     */
    
    public CustomerGroupDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }
    
    

    /**
     *  <p>User-defined unique identifier for the CustomerGroup.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>Unique value which must be different from any value used for <code>name</code> in CustomerGroup in the Project. If not, a DuplicateField error is returned.</p>
     * @return groupName
     */
    
    
    public String getGroupName(){
        return this.groupName;
    }
    
    /**
     *  <p>Custom Fields for the CustomerGroup.</p>
     * @return custom
     */
    
    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }

    /**
     * builds CustomerGroupDraft with checking for non-null required values
     * @return CustomerGroupDraft
     */
    public CustomerGroupDraft build() {
        Objects.requireNonNull(groupName, CustomerGroupDraft.class + ": groupName is missing");
        return new CustomerGroupDraftImpl(key, groupName, custom);
    }
    
    /**
     * builds CustomerGroupDraft without checking for non-null required values
     * @return CustomerGroupDraft
     */
    public CustomerGroupDraft buildUnchecked() {
        return new CustomerGroupDraftImpl(key, groupName, custom);
    }

    /**
     * factory method for an instance of CustomerGroupDraftBuilder
     * @return builder 
     */
    public static CustomerGroupDraftBuilder of() {
        return new CustomerGroupDraftBuilder();
    }

    /**
     * create builder for CustomerGroupDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupDraftBuilder of(final CustomerGroupDraft template) {
        CustomerGroupDraftBuilder builder = new CustomerGroupDraftBuilder();
        builder.key = template.getKey();
        builder.groupName = template.getGroupName();
        builder.custom = template.getCustom();
        return builder;
    }

}
