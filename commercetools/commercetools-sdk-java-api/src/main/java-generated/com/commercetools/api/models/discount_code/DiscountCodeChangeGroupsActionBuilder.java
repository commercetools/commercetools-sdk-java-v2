package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.models.discount_code.DiscountCodeChangeGroupsAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeChangeGroupsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeChangeGroupsAction discountCodeChangeGroupsAction = DiscountCodeChangeGroupsAction.builder()
 *             .plusGroups(groupsBuilder -> groupsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DiscountCodeChangeGroupsActionBuilder implements Builder<DiscountCodeChangeGroupsAction> {

    
    
    private java.util.List<String> groups;

    /**
     *  <p>New value to set. An empty array removes the DiscountCode from all groups.</p>
     * @param groups value to be set
     * @return Builder
     */
    
    public DiscountCodeChangeGroupsActionBuilder groups( final String ...groups) {
        this.groups = new ArrayList<>(Arrays.asList(groups));
        return this;
    }
    
    /**
     *  <p>New value to set. An empty array removes the DiscountCode from all groups.</p>
     * @param groups value to be set
     * @return Builder
     */
    
    public DiscountCodeChangeGroupsActionBuilder groups( final java.util.List<String> groups) {
        this.groups = groups;
        return this;
    }
    
    /**
     *  <p>New value to set. An empty array removes the DiscountCode from all groups.</p>
     * @param groups value to be set
     * @return Builder
     */
    
    public DiscountCodeChangeGroupsActionBuilder plusGroups( final String ...groups) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.addAll(Arrays.asList(groups));
        return this;
    }
    
    
    

    /**
     *  <p>New value to set. An empty array removes the DiscountCode from all groups.</p>
     * @return groups
     */
    
    
    public java.util.List<String> getGroups(){
        return this.groups;
    }

    /**
     * builds DiscountCodeChangeGroupsAction with checking for non-null required values
     * @return DiscountCodeChangeGroupsAction
     */
    public DiscountCodeChangeGroupsAction build() {
        Objects.requireNonNull(groups, DiscountCodeChangeGroupsAction.class + ": groups is missing");
        return new DiscountCodeChangeGroupsActionImpl(groups);
    }
    
    /**
     * builds DiscountCodeChangeGroupsAction without checking for non-null required values
     * @return DiscountCodeChangeGroupsAction
     */
    public DiscountCodeChangeGroupsAction buildUnchecked() {
        return new DiscountCodeChangeGroupsActionImpl(groups);
    }

    /**
     * factory method for an instance of DiscountCodeChangeGroupsActionBuilder
     * @return builder 
     */
    public static DiscountCodeChangeGroupsActionBuilder of() {
        return new DiscountCodeChangeGroupsActionBuilder();
    }

    /**
     * create builder for DiscountCodeChangeGroupsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeChangeGroupsActionBuilder of(final DiscountCodeChangeGroupsAction template) {
        DiscountCodeChangeGroupsActionBuilder builder = new DiscountCodeChangeGroupsActionBuilder();
        builder.groups = template.getGroups();
        return builder;
    }

}
