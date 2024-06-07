
package com.commercetools.api.predicates.expansion.order;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class SyncInfoExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private SyncInfoExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static SyncInfoExpansionBuilderDsl of() {
        return new SyncInfoExpansionBuilderDsl(Collections.emptyList());
    }

    public static SyncInfoExpansionBuilderDsl of(final List<String> path) {
        return new SyncInfoExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.channel.ChannelReferenceExpansionBuilderDsl channel() {
        return com.commercetools.api.predicates.expansion.channel.ChannelReferenceExpansionBuilderDsl
                .of(appendOne(path, "channel"));
    }
}
