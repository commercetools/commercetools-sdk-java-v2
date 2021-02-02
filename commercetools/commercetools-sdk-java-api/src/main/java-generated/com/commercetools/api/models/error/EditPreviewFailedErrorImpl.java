
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class EditPreviewFailedErrorImpl implements EditPreviewFailedError {

    private String code;

    private String message;

    private com.commercetools.api.models.order_edit.OrderEditPreviewFailure result;

    @JsonCreator
    EditPreviewFailedErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("result") final com.commercetools.api.models.order_edit.OrderEditPreviewFailure result) {
        this.message = message;
        this.result = result;
        this.code = EDIT_PREVIEW_FAILED;
    }

    public EditPreviewFailedErrorImpl() {
        this.code = EDIT_PREVIEW_FAILED;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public com.commercetools.api.models.order_edit.OrderEditPreviewFailure getResult() {
        return this.result;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setResult(final com.commercetools.api.models.order_edit.OrderEditPreviewFailure result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        EditPreviewFailedErrorImpl that = (EditPreviewFailedErrorImpl) o;

        return new EqualsBuilder().append(code, that.code).append(message, that.message).append(result,
            that.result).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(result).toHashCode();
    }

}
