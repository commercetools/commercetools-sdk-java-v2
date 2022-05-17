
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountCodeUpdateImpl.class)
public interface DiscountCodeUpdate extends
        com.commercetools.api.models.ResourceUpdate<DiscountCodeUpdate, DiscountCodeUpdateAction, DiscountCodeUpdateBuilder> {

    /**
    *  <p>Expected version of the DiscountCode on which the changes should be applied.
    *  If the expected version does not match the actual version, a <a href="/../api/errors#409-conflict">409 Conflict</a> will be returned.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
    *  <p>Update actions to be performed on the DiscountCode.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<DiscountCodeUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final DiscountCodeUpdateAction... actions);

    public void setActions(final List<DiscountCodeUpdateAction> actions);

    public static DiscountCodeUpdate of() {
        return new DiscountCodeUpdateImpl();
    }

    public static DiscountCodeUpdate of(final DiscountCodeUpdate template) {
        DiscountCodeUpdateImpl instance = new DiscountCodeUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static DiscountCodeUpdateBuilder builder() {
        return DiscountCodeUpdateBuilder.of();
    }

    public static DiscountCodeUpdateBuilder builder(final DiscountCodeUpdate template) {
        return DiscountCodeUpdateBuilder.of(template);
    }

    default <T> T withDiscountCodeUpdate(Function<DiscountCodeUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeUpdate>";
            }
        };
    }
}
