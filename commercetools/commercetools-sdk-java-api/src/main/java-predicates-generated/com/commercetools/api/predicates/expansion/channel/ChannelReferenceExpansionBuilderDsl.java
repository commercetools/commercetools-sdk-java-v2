
package com.commercetools.api.predicates.expansion.channel;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ChannelReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ChannelReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ChannelReferenceExpansionBuilderDsl of() {
        return new ChannelReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static ChannelReferenceExpansionBuilderDsl of(final List<String> path) {
        return new ChannelReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.channel.ChannelExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.channel.ChannelExpansionBuilderDsl.of(appendOne(path, "obj"));
    }
}
