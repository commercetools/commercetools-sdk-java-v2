
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductStateTransitionMessageImpl.class)
public interface ProductStateTransitionMessage extends Message {

    String PRODUCT_STATE_TRANSITION = "ProductStateTransition";

    @NotNull
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateReference state);

    public void setForce(final Boolean force);

    public static ProductStateTransitionMessage of() {
        return new ProductStateTransitionMessageImpl();
    }

    public static ProductStateTransitionMessage of(final ProductStateTransitionMessage template) {
        ProductStateTransitionMessageImpl instance = new ProductStateTransitionMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    public static ProductStateTransitionMessageBuilder builder() {
        return ProductStateTransitionMessageBuilder.of();
    }

    public static ProductStateTransitionMessageBuilder builder(final ProductStateTransitionMessage template) {
        return ProductStateTransitionMessageBuilder.of(template);
    }

    default <T> T withProductStateTransitionMessage(Function<ProductStateTransitionMessage, T> helper) {
        return helper.apply(this);
    }
}
