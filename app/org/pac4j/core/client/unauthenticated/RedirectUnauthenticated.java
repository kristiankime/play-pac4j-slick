package org.pac4j.core.client.unauthenticated;

import org.pac4j.core.client.IndirectClient;
import org.pac4j.core.context.WebContext;
import org.pac4j.core.credentials.AnonymousCredentials;
import org.pac4j.core.credentials.UsernamePasswordCredentials;
import org.pac4j.core.exception.HttpAction;
import org.pac4j.core.profile.CommonProfile;
import org.pac4j.core.redirect.RedirectAction;

public class RedirectUnauthenticated extends IndirectClient<AnonymousCredentials, CommonProfile> {

    @Override
    protected void clientInit(WebContext context) {
        defaultRedirectActionBuilder(webContext ->  RedirectAction.redirect(computeFinalCallbackUrl(webContext)));
    }

    @Override
    protected AnonymousCredentials retrieveCredentials(final WebContext context) throws HttpAction {
        return AnonymousCredentials.INSTANCE;
    }

}
