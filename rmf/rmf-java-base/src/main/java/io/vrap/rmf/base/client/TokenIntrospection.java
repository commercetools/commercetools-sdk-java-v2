
package io.vrap.rmf.base.client;

public class TokenIntrospection {

    private boolean active;

    private String scope;

    private Long exp;

    public TokenIntrospection() {

    }

    public boolean isActive() {
        return active;
    }

    public void setActive(final boolean active) {
        this.active = active;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(final String scope) {
        this.scope = scope;
    }

    public Long getExp() {
        return exp;
    }

    public void setExp(final Long exp) {
        this.exp = exp;
    }
}
