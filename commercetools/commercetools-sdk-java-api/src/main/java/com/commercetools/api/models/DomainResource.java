package com.commercetools.api.models;

import java.time.ZonedDateTime;

public interface DomainResource<T> {
    public String getId();

    public Long getVersion();

    public ZonedDateTime getCreatedAt();

    public ZonedDateTime getLastModifiedAt();
}
