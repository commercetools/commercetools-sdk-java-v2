
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountCodeChangeGroupsActionImpl.class)
public interface DiscountCodeChangeGroupsAction extends DiscountCodeUpdateAction {

    String CHANGE_GROUPS = "changeGroups";

    /**
    *  <p>New value to set. An empty array removes the DiscountCode from all groups.</p>
    */
    @NotNull
    @JsonProperty("groups")
    public List<String> getGroups();

    @JsonIgnore
    public void setGroups(final String... groups);

    public void setGroups(final List<String> groups);

    public static DiscountCodeChangeGroupsAction of() {
        return new DiscountCodeChangeGroupsActionImpl();
    }

    public static DiscountCodeChangeGroupsAction of(final DiscountCodeChangeGroupsAction template) {
        DiscountCodeChangeGroupsActionImpl instance = new DiscountCodeChangeGroupsActionImpl();
        instance.setGroups(template.getGroups());
        return instance;
    }

    public static DiscountCodeChangeGroupsActionBuilder builder() {
        return DiscountCodeChangeGroupsActionBuilder.of();
    }

    public static DiscountCodeChangeGroupsActionBuilder builder(final DiscountCodeChangeGroupsAction template) {
        return DiscountCodeChangeGroupsActionBuilder.of(template);
    }

    default <T> T withDiscountCodeChangeGroupsAction(Function<DiscountCodeChangeGroupsAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeChangeGroupsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeChangeGroupsAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeChangeGroupsAction>";
            }
        };
    }
}
