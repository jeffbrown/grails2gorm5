import demo.InterviewAliasExclusion
import demo.InterviewAlias
import demo.Interview

class BootStrap {

    def init = { servletContext ->
        new InterviewAliasExclusion(name: 'Exclusion One',
                                    alias: new InterviewAlias(aliasName: 'Alias One').save(),
                                    interview: new Interview(name: 'Interview One', activeInd: true).save()).save()
        new InterviewAliasExclusion(name: 'Exclusion Two',
                                    alias: new InterviewAlias(aliasName: 'Alias Two').save(),
                                    interview: new Interview(name: 'Interview Two', activeInd: false).save()).save()
        new InterviewAliasExclusion(name: 'Exclusion Three',
                                    alias: new InterviewAlias(aliasName: 'Alias Three').save(),
                                    interview: new Interview(name: 'Interview Three', activeInd: true).save()).save()
        new InterviewAliasExclusion(name: 'Exclusion Four',
                                    alias: new InterviewAlias(aliasName: 'Alias Four').save(),
                                    interview: new Interview(name: 'Interview Four', activeInd: false).save()).save()
    }
    def destroy = {
    }
}
