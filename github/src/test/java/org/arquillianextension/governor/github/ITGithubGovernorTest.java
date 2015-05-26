package org.arquillianextension.governor.github;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.notNullValue;

import org.arquillian.extension.governor.github.api.Github;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class ITGithubGovernorTest {

    @ArquillianResource
    GitHubClient githubClient;

    @Test
    @Github("1")
    public void closeIssue() {
        assertThat(githubClient, notNullValue());
    }
    @Test
    @Github("2")
    public void reopenIssue() {
        fail("This test should fail to reopen the issue.");
    }
}
