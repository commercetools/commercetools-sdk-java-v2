
package com.commercetools.api.models.api_client;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ApiClientDraftBuilder implements Builder<ApiClientDraft> {

    private String name;

    private String scope;

    @Nullable
    private Long deleteDaysAfterCreation;

    public ApiClientDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ApiClientDraftBuilder scope(final String scope) {
        this.scope = scope;
        return this;
    }

    public ApiClientDraftBuilder deleteDaysAfterCreation(@Nullable final Long deleteDaysAfterCreation) {
        this.deleteDaysAfterCreation = deleteDaysAfterCreation;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public String getScope() {
        return this.scope;
    }

    @Nullable
    public Long getDeleteDaysAfterCreation() {
        return this.deleteDaysAfterCreation;
    }

    public ApiClientDraft build() {
        Objects.requireNonNull(name, ApiClientDraft.class + ": name is missing");
        Objects.requireNonNull(scope, ApiClientDraft.class + ": scope is missing");
        return new ApiClientDraftImpl(name, scope, deleteDaysAfterCreation);
    }

    /**
     * builds ApiClientDraft without checking for non null required values
     */
    public ApiClientDraft buildUnchecked() {
        return new ApiClientDraftImpl(name, scope, deleteDaysAfterCreation);
    }

    public static ApiClientDraftBuilder of() {
        return new ApiClientDraftBuilder();
    }

    public static ApiClientDraftBuilder of(final ApiClientDraft template) {
        ApiClientDraftBuilder builder = new ApiClientDraftBuilder();
        builder.name = template.getName();
        builder.scope = template.getScope();
        builder.deleteDaysAfterCreation = template.getDeleteDaysAfterCreation();
        return builder;
    }

}
