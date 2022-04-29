
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order_edit.OrderEditPreviewFailure;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = EditPreviewFailedErrorImpl.class)
public interface EditPreviewFailedError extends ErrorObject {

    String EDIT_PREVIEW_FAILED = "EditPreviewFailed";

    @NotNull
    @Valid
    @JsonProperty("result")
    public OrderEditPreviewFailure getResult();

    public void setResult(final OrderEditPreviewFailure result);

    public static EditPreviewFailedError of() {
        return new EditPreviewFailedErrorImpl();
    }

    public static EditPreviewFailedError of(final EditPreviewFailedError template) {
        EditPreviewFailedErrorImpl instance = new EditPreviewFailedErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setResult(template.getResult());
        return instance;
    }

    public static EditPreviewFailedErrorBuilder builder() {
        return EditPreviewFailedErrorBuilder.of();
    }

    public static EditPreviewFailedErrorBuilder builder(final EditPreviewFailedError template) {
        return EditPreviewFailedErrorBuilder.of(template);
    }

    default <T> T withEditPreviewFailedError(Function<EditPreviewFailedError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<EditPreviewFailedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EditPreviewFailedError>() {
            @Override
            public String toString() {
                return "TypeReference<EditPreviewFailedError>";
            }
        };
    }
}
