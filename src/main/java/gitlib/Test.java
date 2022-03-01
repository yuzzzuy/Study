package gitlib;


import lombok.SneakyThrows;
import org.gitlab.api.GitlabAPI;
import org.gitlab.api.models.GitlabProjectHook;

import java.util.List;

/**
 * @author WangChen
 * @date 2021/11/5 15:48
 */
public class Test {
    @SneakyThrows
    public static void main(String[] args) {
        GitlabAPI api = GitlabAPI.connect("http://192.168.201.40/", "Eqzo1szXgat1Ga4RvZma");
        List<GitlabProjectHook> systemHooks = api.getProjectHooks(api.getProject(1767));
        System.out.println(systemHooks);

    }
}
