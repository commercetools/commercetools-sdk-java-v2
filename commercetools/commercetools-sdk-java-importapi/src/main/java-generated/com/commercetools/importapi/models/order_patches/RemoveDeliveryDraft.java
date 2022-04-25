
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = RemoveDeliveryDraftImpl.class)
public interface RemoveDeliveryDraft {

    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setId(final String id);

    public static RemoveDeliveryDraft of() {
        return new RemoveDeliveryDraftImpl();
    }

    public static RemoveDeliveryDraft of(final RemoveDeliveryDraft template) {
        RemoveDeliveryDraftImpl instance = new RemoveDeliveryDraftImpl();
        instance.setId(template.getId());
        return instance;
    }

    public static RemoveDeliveryDraftBuilder builder() {
        return RemoveDeliveryDraftBuilder.of();
    }

    public static RemoveDeliveryDraftBuilder builder(final RemoveDeliveryDraft template) {
        return RemoveDeliveryDraftBuilder.of(template);
    }

    default <T> T withRemoveDeliveryDraft(Function<RemoveDeliveryDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<RemoveDeliveryDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveDeliveryDraft>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveDeliveryDraft>";
            }
        };
    }
}
