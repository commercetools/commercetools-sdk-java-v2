
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeChangeGroupsAction
 *
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeChangeGroupsActionImpl.class)
public interface DiscountCodeChangeGroupsAction extends DiscountCodeUpdateAction {

    /**
     * discriminator value for DiscountCodeChangeGroupsAction
     */
    String CHANGE_GROUPS = "changeGroups";

    /**
     *  <p>New value to set. An empty array removes the DiscountCode from all groups.</p>
     * @return groups
     */
    @NotNull
    @JsonProperty("groups")
    public List<String> getGroups();

    /**
     *  <p>New value to set. An empty array removes the DiscountCode from all groups.</p>
     * @param groups values to be set
     */

    @JsonIgnore
    public void setGroups(final String... groups);

    /**
     *  <p>New value to set. An empty array removes the DiscountCode from all groups.</p>
     * @param groups values to be set
     */

    public void setGroups(final List<String> groups);

    /**
     * factory method
     * @return instance of DiscountCodeChangeGroupsAction
     */
    public static DiscountCodeChangeGroupsAction of() {
        return new DiscountCodeChangeGroupsActionImpl();
    }

    /**
     * factory method to copy an instance of DiscountCodeChangeGroupsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeChangeGroupsAction of(final DiscountCodeChangeGroupsAction template) {
        DiscountCodeChangeGroupsActionImpl instance = new DiscountCodeChangeGroupsActionImpl();
        instance.setGroups(template.getGroups());
        return instance;
    }

    /**
     * builder factory method for DiscountCodeChangeGroupsAction
     * @return builder
     */
    public static DiscountCodeChangeGroupsActionBuilder builder() {
        return DiscountCodeChangeGroupsActionBuilder.of();
    }

    /**
     * create builder for DiscountCodeChangeGroupsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeChangeGroupsActionBuilder builder(final DiscountCodeChangeGroupsAction template) {
        return DiscountCodeChangeGroupsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeChangeGroupsAction(Function<DiscountCodeChangeGroupsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeChangeGroupsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeChangeGroupsAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeChangeGroupsAction>";
            }
        };
    }
}
