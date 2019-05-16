def defaultArticle = siteItemService.getSiteItem("/site/articles/2019/05/a-better-way-to-artichokes.xml")
templateModel.currentArticle  = defaultArticle

if(params.id) {
    templateModel.currentArticle = siteItemService.getSiteItem("/site/articles/"+params.id+".xml")
}