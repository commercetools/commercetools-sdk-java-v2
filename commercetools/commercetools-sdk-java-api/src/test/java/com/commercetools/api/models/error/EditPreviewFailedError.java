package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.order_edit.OrderEditPreviewFailure;
import com.commercetools.api.models.error.EditPreviewFailedErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = EditPreviewFailedErrorImpl.class)
public interface EditPreviewFailedError extends ErrorObject {

    String EDIT_PREVIEW_FAILED = "EditPreviewFailed";

    
    @NotNull
    @Valid
    @JsonProperty("result")
    public OrderEditPreviewFailure getResult();

    
    public void setResult(final OrderEditPreviewFailure result);
    

    public static EditPreviewFailedError of(){
        return new EditPreviewFailedErrorImpl();
    }
    

    public static EditPreviewFailedError of(final EditPreviewFailedError template) {
        EditPreviewFailedErrorImpl instance = new EditPreviewFailedErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setResult(template.getResult());
        return instance;
    }

    public static EditPreviewFailedErrorBuilder builder(){
        return EditPreviewFailedErrorBuilder.of();
    }
    
    public static EditPreviewFailedErrorBuilder builder(final EditPreviewFailedError template){
        return EditPreviewFailedErrorBuilder.of(template);
    }
    

    default <T> T withEditPreviewFailedError(Function<EditPreviewFailedError, T> helper) {
        return helper.apply(this);
    }
}
