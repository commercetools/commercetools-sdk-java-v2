
package com.commercetools.api.models.api_client;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ApiClientDraftImpl.class)
public interface ApiClientDraft {

    @NotNull
    @JsonProperty("name")
    public String getName();

    @NotNull
    @JsonProperty("scope")
    public String getScope();

    /**
    *  <p>If set, the client will be deleted after the specified amount of days.</p>
    */

    @JsonProperty("deleteDaysAfterCreation")
    public Long getDeleteDaysAfterCreation();

    public void setName(final String name);

    public void setScope(final String scope);

    public void setDeleteDaysAfterCreation(final Long deleteDaysAfterCreation);

    public static ApiClientDraft of() {
        return new ApiClientDraftImpl();
    }

    public static ApiClientDraft of(final ApiClientDraft template) {
        ApiClientDraftImpl instance = new ApiClientDraftImpl();
        instance.setName(template.getName());
        instance.setScope(template.getScope());
        instance.setDeleteDaysAfterCreation(template.getDeleteDaysAfterCreation());
        return instance;
    }

    public static ApiClientDraftBuilder builder() {
        return ApiClientDraftBuilder.of();
    }

    public static ApiClientDraftBuilder builder(final ApiClientDraft template) {
        return ApiClientDraftBuilder.of(template);
    }

    default <T> T withApiClientDraft(Function<ApiClientDraft, T> helper) {
        return helper.apply(this);
    }
}
