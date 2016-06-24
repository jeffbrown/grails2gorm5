package demo

class DemoController {

    def index() {
        def interviewIdsForExclusion = [1l, 2l, 3l, 4l]
        def results = InterviewAliasExclusion.withCriteria {
            interview {
                'in'('id', interviewIdsForExclusion)
                eq 'activeInd', true
            }
        }?.collectEntries {
            [it.alias.id, it.alias]
        }

        render results
    }
}
